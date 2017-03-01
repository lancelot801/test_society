$(function() {
	
	$(document).ready(function() {
		$("#theTarget").skippr();
	});
	
	$("#theTarget").skippr({
		transition: 'slide',
		speed: 1000,
		easing: 'easeOutQuart',
		navType: 'block',
		childrenElementType: 'div',
		arrows: true,
		autoPlay: false,
		autoPlayDuration: 5000,
		keyboardOnAlways: true,
		hidePrevious: false
	});

	//登录
	$("#userlogin").click(function() {
		$("#mylogin").modal().draggable({
			handle: ".modal-header",
			cursor: 'move',
			refreshPositions: false
		});
	});
	
	//注册
	$("#registAccount").click(function() {
		alert("123");
		$("#registerModal").modal().draggable({
			handle: ".modal-header",
			cursor: 'move',
			refreshPositions: false
		});
	});	
});
/*
function register(){}
$("#registerModal").modal().draggable({
	handle: ".modal-header",
	cursor: 'move',
	refreshPositions: false
}); */