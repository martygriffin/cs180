package edu.ucr.c3.wms.helper.tags;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringTokenizer;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

import edu.ucr.c3.wms.utils.PageableChunk;

/**
 * SortLink
 * 
 * @author ryanrich
 */
public class SortLink extends TagSupport {
	
	private static final long serialVersionUID = 1L;
	public SortLink() {
		super();
	}

	/* (non-Javadoc)
	 * @see javax.servlet.jsp.tagext.Tag#doStartTag()
	 */
	public int doStartTag() throws JspException {
		StringBuffer link = new StringBuffer();
		ServletRequest req = pageContext.getRequest();
		//TagUtils tagUtils = TagUtils.getInstance();
		HttpServletResponse resp = 
				(HttpServletResponse)pageContext.getResponse();
		String currentSort = req.getParameter("sortItem");
		String currentDir = req.getParameter("sortDir");
		
		link.append("<a href=\"");
		
		StringBuffer href = new StringBuffer();
		//href.append(tagUtils.getActionMappingURL(action, pageContext));
		href.append("?sortItem=");
		href.append(encode(sortItem));
		href.append("&sortDir=");
		
		if (currentSort != null && currentSort.equalsIgnoreCase(sortItem)) {
				if (currentDir != null && currentDir.equals(String.valueOf(
						PageableChunk.SORT_DIR_ASC))) {
					href.append(PageableChunk.SORT_DIR_DESC);								
				} else {
					href.append(PageableChunk.SORT_DIR_ASC);
				}
		} else {
			href.append(PageableChunk.SORT_DIR_ASC);
		}//else

		if (includedRequestVars != null) {
			StringBuffer otherIncluded = buildIncludeVarsString(); 
			if (otherIncluded != null && otherIncluded.length() > 0) {
				href.append("&");
				href.append(otherIncluded);
			}
		}
		
		link.append(resp.encodeURL(href.toString()));
		link.append("\" ");
		if (styleClass != null && !"".equals(styleClass)) {
			link.append("class=\"");
			link.append(styleClass);
			link.append("\" ");
		}
		link.append(">");
		
		try {
			JspWriter out = pageContext.getOut();
			out.println(link.toString());
		} catch (IOException ioex) {
			throw new JspTagException(ioex.getMessage());
		}//catch
		
		return Tag.EVAL_BODY_INCLUDE;
	}
	
	/* (non-Javadoc)
	 * @see javax.servlet.jsp.tagext.Tag#doEndTag()
	 */
	public int doEndTag() throws JspException {
		try {
			JspWriter out = pageContext.getOut();
			out.println("</a>");
		} catch (IOException ioex) {
			throw new JspTagException(ioex.getMessage());
		}//catch
				
		return Tag.EVAL_PAGE;
	}	
	
	/**
	 * @param string
	 */
	public void setSortItem(String string) {
		sortItem = string;
	}
	
	/**
	 * @param string
	 */
	public void setAction(String string) {
		action = string;
	}
	
	public void setStyleClass(String styleClass) {
		this.styleClass = styleClass;
	}
		
	public void setIncludedRequestVars(String includedRequestVars) {
		this.includedRequestVars = includedRequestVars;
	}	


	/* (non-Javadoc)
	 * @see javax.servlet.jsp.tagext.Tag#release()
	 */
	public void release() {
		super.release();
		sortItem = null;
		action = null;
		styleClass = null;
		includedRequestVars = null;
	}
	
	private StringBuffer buildIncludeVarsString() throws JspException {
		StringBuffer vars = new StringBuffer();
		ServletRequest req = pageContext.getRequest();
		
		if (includedRequestVars != null) {
			StringTokenizer tokenizer = new StringTokenizer(includedRequestVars,
					",");
			boolean anyAdded = false;
			while (tokenizer.hasMoreTokens()) {
				String token = tokenizer.nextToken();
				String value = req.getParameter(token);
				if (value != null && !value.equals("")) {
					if (anyAdded) {
						vars.append('&');
					}//if					
					vars.append(encode(token));
					vars.append('=');
					vars.append(encode(value));
					anyAdded = true;
				}//if
			}//while
		}//if		
		return vars;
	}
	
	
	private String encode(String data) throws JspException {
		String rslt = "";
		if (data != null) {
			try {
				rslt = URLEncoder.encode(data, "UTF-8"); 	
			} catch (UnsupportedEncodingException ex) {
				throw new JspException("Internal error: " + ex.getMessage());
			}
		}//if
		return rslt;
	}	
	
	private String sortItem;
	private String action;
	private String styleClass;
	private String includedRequestVars;

}
