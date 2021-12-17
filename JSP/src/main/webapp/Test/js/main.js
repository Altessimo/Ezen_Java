/**
 * 
 */
/* 회원탈퇴 API Start */
$(function(){
	$("#delete").click(function(){
	$.ajax({
		url: "../../controller/memberdeletecontroller.jsp",
		data: {password: document.getElementById("deleteform").password.value},
		success : function(result){
			if(result == 1){
				alert('회원탈퇴 되었습니다.');
				location.href='../../controller/logoutcontroller.jsp';
			} else {
				document.getElementById("deleteresult").innerHTML="회원정보가 다릅니다";
			}
		} 
	});
	}); 
});

/* 아이디 중복체크[ajax] */
$(function() {
	$("#id").change(function(){
	$.ajax({
		url:"idcheck.jsp",
		data: {userid:document.getElementById("singupform").id.value},
		success: function(result) {
			if(result==1) {
				document.getElementById("idresult").innerHTML="현재 사용중인 아이디 입니다.";
			} else {
			}
		}
	});
	});
});
/* 아이디 중복체크 end */

// 회원이름 수정
function namechange(){
document.getElementById("tdname").innerHTML="<input type='text' id='name' class='form-control'> <button id='namechangebtn' class='form-control'>확인</button>"

$(function(){
	$("#namechangebtn"),click(function(){
	$.ajax({
		url: "../../controller/memberupdate.jsp",
		data:{newname: document.getElementById("name").value},
		success: function(result){
			if(result == 1){
				document.getElementById("tdname").innerHTML=document.getElementById("name").value;
			} else {
				alert("[수정오류] 관리자에게 문의")
			}
		}
	})
	});
});
}

/* 회원가입 유효성검사 */
function singupcheck(){
	var id = document.getElementById("singupform").id.value;
	var password=document.getElementById("singupform").password.value;
	var passwordconfirm=document.getElementById("singupform").passwordconfirm.value;
	var name=document.getElementById("singupform").name.value;
	var birth=document.getElementById("singupform").birth.value;
	var sex1=document.getElementById("singupform").sex1.checked;
	var sex2=document.getElementById("singupform").sex2.checked;
	var phone=document.getElementById("singupform").phone.value;

		var idj=/^[a-z0-9]{5,15}$/;
		var pwj=/^[A-Za-z0-9]{5,15}$/;
		var phonej=/^01([0|1|6|7|8|9]?)-?([0-9]{3,4})-?([0-9]{4})$/;
		var namej=/^[A-Za-z0-9가-힣]{1,15}$/;	
		
	// 아이디
	if(!idj.test(id)){
		document.getElementById("idresult").innerHTML="아이디는 소문자의 숫자 조합 5~15사이만 가능합니다.";
		document.getElementById("idresult").style.color="red";
		return false;
	} else {
		document.getElementById("idresult").innerHTML="사용가능한 아이디 입니다.";
		document.getElementById("idresult").style.color="green";
		}
		
		// 패스워드[두 패스워드 동일한지 검사]
		if(!pwj.test(password)||!pwj.test(passwordconfirm)) {
			document.getElementById("pwresult").innerHTML="대소문자 조합 5~15사이만 가능합니다."; return false;
		} else if(password!=passwordconfirm) {
			document.getElementById("pwresult").innerHTML="패스워드가 동일하지 않습니다."; return false;
		} else {
			document.getElementById("pwresult").innerHTML="사용가능한 패스워드 입니다.";
		}
		
		// 이름
		if(!namej.test(name)) {
		document.getElementById("nameresult").innerHTML="이름을 입력해주세요.[특수문자는 제외]"; return false;
		} else {
			document.getElementById("nameresult").innerHTML=" ";
		}
		
		// 생년월일
		if(birth==""){
		document.getElementById("birthsult").innerHTML="생년월일을 선택해주세요."; return false;
		} else {
			document.getElementById("birthsult").innerHTML=" ";
		}
		
		// 성별
		if(!sex1 && !sex2) { // 둘 다 false 이면 = 둘 다 체크를 안했으면
		document.getElementById("sexsult").innerHTML="성별을 선택해주세요."; return false;
		} else {
			document.getElementById("sexsult").innerHTML=" ";
		}
		
		// 전화번호
		if(!phonej.test(phone)){
			document.getElementById("phoneresult").innerHTML="전화번호 형식으로 입력해주세요"; return false;
		} else {
			document.getElementById("phoneresult").innerHTML=" ";
		}
}
/* 회원가입 유효성검사 end */