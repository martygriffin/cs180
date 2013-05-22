function show(i){
	var v = document.getElementById("days"+i);
	v.style.visibility = "visible";
	v = document.getElementById("time"+i);
	v.style.visibility = "visible";
}

function showFilled(){
	for(i=2;i<=5;i++){
		var v = document.getElementById("days"+i);
		var u = document.getElementById("time"+i);
		if(v.childNodes[3].childNodes[0].value != ""){
			v.style.visibility = "visible";
			u.style.visibility = "visible";
		}
	}
}

function hide(i){
	for(;i<=5;i++){
		var v = document.getElementById("days"+i);
		v.style.visibility = "collapse";
		v.childNodes[3].childNodes[0].value = "";
		v = document.getElementById("time"+i);
		v.style.visibility = "collapse";
		v.childNodes[3].childNodes[0].value = "";
	}
}