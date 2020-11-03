$(function(){
	$('#sign').attr("disabled","disabled");
	$('#id').blur(function(){
		$.ajax({
			type:"GET",
			url:"idCheck",
			data:{
				"id":$('#id').val()
			},
			success : function(data) {
	        	 if ($.trim(data) == "YES") {
		                if ($('#id').val() != '') {
		                	$('#id_check').text("");
		                	alert("사용가능한 아이디 입니다.")
		                }
		            } else {
		                if ($('#id').val() != '') {
		                	$('#id_check').text("중복된 아이디입니다.");
		                	$('#id_check').css('color','red');
		                    $('#id').val('');
		                    $('#id').focus();
		                }	               
		         }
			 }	           
		})
	});	
	
	$('#email').blur(function(){
		$.ajax({
			type:"GET",
			url:"emailCheck",
			data:{
				"email":$('#email').val()
			},
			success : function(data) {
	        	 if ($.trim(data) == "YES") {
		                if ($('#email').val() != '') {
		                	alert("사용가능한 이메일입니다.")
		                	$('#email_check').text(" ");
		                	$('#sign').removeAttr("disabled");
		                }
		            } else {
		                if ($('#email').val() != '') {
		                	$('#email_check').text("중복된 이메일 입니다.");
		                	$('#email_check').css('color','red');
		                    $('#email').val('');
		                    $('#email').focus();
		                }	               
		         }
			 }	           
		})
	});	
	
	$('#phone').blur(function(){
		var regNumber=/^\d{3}-\d{3,4}-\d{4}$/;
		var temp=$("#phone").val();
			
		$.ajax({
			type:"GET",
			url:"phoneCheck",
			data:{
				"phone":$('#phone').val()
			},
			success : function(data) {
	        	 if ($.trim(data) == "YES") {
		                if ($('#phone').val() != '') {
		                    alert("사용 가능한 번호 입니다.")
		                    $('#phone_check').text(" ");
		                }
		            } else {
		                if ($('#phone').val() != '') {
		                	$('#phone_check').text("중복된 번호 입니다.");
		                	$('#phone_check').css('color','red');
		                    $('#phone').val('');
		                    $('#phone').focus();
		                }	               
		         }
			 }	           
		})
		if(!regNumber.test(temp)){
			alert("알맞은 형태로 입력하세요");
			$('#phone').val('');
		}
	});	
	
	$('#pwdchk').blur(function(){
		var pwd1=$('#pwd').val();
		var pwd2=$('#pwdchk').val();
		
		if(pwd1!=''&&pwd2!=''){
			if(pwd1==pwd2){
				$('#pwd').css('border-color','blue');
				$('#pwdchk').css('border-color','blue');
				$('#pwd_check').text(" ");
			}else{
				$('#pwd_check').text("비밀번호 불일치.");
            	$('#pwd_check').css('color','red');
				$('#pwd').css('border-color','#dc143c');
				$('#pwdchk').css('border-color','#dc143c');
			}	
		}
	});
});