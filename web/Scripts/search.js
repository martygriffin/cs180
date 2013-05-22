var sURL = unescape(window.location.pathname);

function doLoad()
{
    // the timeout value should be the same as in the "refresh" meta-tag
    setTimeout( "refresh()", 2*1000 );
}

function refresh()
{
    //  This version of the refresh function will cause a new
    //  entry in the visitor's history.  It is provided for
    //  those browsers that only support JavaScript 1.0.
    //
    window.location.href = sURL;
}
function show_student(){
	var v = document.getElementById("student");
	var a = document.getElementById("search_do_search_student_option");
//	if(a.childNodes[3]=="Select student attribute")
//		{
//			hide_student()
//		}
	v.style.visibility = "visible";
	
}
function hide_student(){
	
		var v = document.getElementById("student");
		v.style.visibility = "collapse";
		v.style.visibility = "collapse";
	
	}
function show_classes(){
	var v = document.getElementById("classes");
	v.style.visibility = "visible";
	
}
function hide_classes(){
	
		var v = document.getElementById("classes");
		v.style.visibility = "collapse";
	}
function show_sess()
{
	var v = document.getElementById("sess");
	v.style.visibility = "visible";
}
function hide_sess()
{
		var v = document.getElementById("sess");
		v.style.visibility = "collapse";	
	
	}
function show_date()
{
	var v = document.getElementById("date");
	v.style.visibility = "visible";
}
function hide_date()
{
		var v = document.getElementById("date");
		v.style.visibility = "collapse";	
	
	}
function show_status()
{
	var v = document.getElementById("status");
	v.style.visibility = "visible";
}
function hide_status()
{
		var v = document.getElementById("status");
		v.style.visibility = "collapse";	
	
	}
function show_term()
{
	var v = document.getElementById("term");
	v.style.visibility = "visible";
}
function hide_term()
{
		var v = document.getElementById("term");
		v.style.visibility = "collapse";	
	
	}
function show_confirm()
{
	var v = document.getElementById("confirm");
	v.style.visibility = "visible";
}
function hide_confirm()
{
		var v = document.getElementById("confirm");
		v.style.visibility = "collapse";	
	
	}


