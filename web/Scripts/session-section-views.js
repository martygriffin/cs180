function getParams(){
	var first = document.getElementById("start_end").value;
	var second = document.getElementById("on_before_after").value;
	var date = document.getElementById("datepicker").value;
	return "?type=" + first + "&when=" + second + "&date=" + date;
}

function manage_labclass_view(){
	location.href = "view_manage_labclass.do" + getParams();
}

function manage_workshop_view(){
	location.href = "view_manage_workshop.do" + getParams();
}

function view_labclass_view(){
	location.href = "view_labclass.do" + getParams();
}

function view_workshop_view(){
	location.href = "view_workshop.do" + getParams();
}