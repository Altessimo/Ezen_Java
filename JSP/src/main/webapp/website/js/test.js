/**
 * 
 */

var price = 5; var num1=14; // 변수선언
var total = price*num1; // 변수 연산
	
// 현재 문서의 html 태그 id 가져오기[span을 객체로 가져오기]
var elem = document.getElementById("number");
elem.textContent = total;
		
var minus=price-num1;
var plus=price+num1;
var elem1=document.getElementById("number1");
if(price==num1) {
	elem1.textContent = minus;
} else {
	elem1.textContent = plus;
}

function start() { // 함수 선언[function : 메소드명(){ 실행문 }]
	// 배열 선언 : var 변수명 = [요소1, 요소2, 요소3 ...]
	var color=["red","white","black"];
	
	var colorName=document.getElementById("color");
	colorName.textContent = color[0];
	colorName.style.color = color[0]; // 태그명.style.속성
	
	var colors = color.length;
	var colorLength=document.getElementById("colors");
	colorLength.textContent = colors;
	document.body.style.backgroundColor="LemonChiffon";
}

// 
function start2(){
	var text = ""; // 변수선언[]자료형 없음]
	var count = 1; // 변수선언
	// while 문
	while(count<10) { // 반복문
		text +="<li> 여기는 숫자"+count+"</li>";
			// 변수는 " " 처리 불가
			// html 태그는 문자처리
			count++;
		
	} document.getElementById("list").innerHTML=text;
/*	if 문
	if(document.getElementById("list").innerHTML != "text"){
		document.getElementById("list").innerHTML = "";
}*/

// for 문
var text1="";
for(var i=1; i<6; i++){
	text+="<li> 여기는 숫자 : "+i+"</li>";
}
document.getElementById("list1").innerHTML = text1;

// for 배열
var text2="";
var phones=["아이폰", "캘럭시폰", "엘지폰"];
for(var i=0; i<phones.length; i++){
	text2+="<li>"+phone[i]+"</li>";
}
document.getElementById("list2").innerHTML=text2;
}

// 
function cancel(){
	document.getElementById("list").innerHTML = "";
	document.getElementById("list1").innerHTML = "";
	document.getElementById("list2").innerHTML = "";
}

// 추가 버튼을 누르면 콜라 문구가 계속 뜸
function start3() {
	// 기존 리스트를 가져오기
	var text=document.getElementById("list").innerHTML;
	var product="콜라"; // 변수명 
	text+="<li>"+product+"</li>"; // 콜라 변수 추가
	document.getElementById("list").innerHTML=text;
}

// 계산을 해줌
function start4(num1, num2) { // 변수를 인수로 받음
	var total=num1 * num2; // 인수연산
	document.getElementById("result").textContent=total;
}

// 
