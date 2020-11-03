$(function(){
	$('#end').blur(function(){
		$.ajax({
			type:"GET",
			url:"calculator",
			data:{
				"start":$('#start').val(),
				"end":$('#end').val(),
				"n_exp":$('#n_exp').val(),
				"n_gold":$('#n_gold').val(),
				"n_essence":$('#n_essence').val(),
				"m_exp":$('#m_exp').val(),
				"m_gold":$('#m_gold').val(),
				"h_essence":$('#h_essence').val()
			},
			success : function(afkvalue) {
				$('#Exp').text(afkvalue.totalExp);
				$('#Gold').text(afkvalue.totalGold);
				$('#Essence').text(afkvalue.totalEssence);
			 	$('#t_exp').text(afkvalue.t_exp);
			 	$('#t_gold').text(afkvalue.t_gold);
			 	$('#t_essence').text(afkvalue.t_essence);
			 	$('#max_time').text(afkvalue.max_time);
			 	$('#temp_Max').text(afkvalue.max_hour+":"+afkvalue.max_min+":"+afkvalue.max_sec);
			 	$.fn.sum();
			 	$.fn.sum_time();
			 	$.fn.sum_MaxTime();
			}
		})
	});
	
	$('#end2').blur(function(){
		$.ajax({
			type:"GET",
			url:"calculator",
			data:{
				"start":$('#start2').val(),
				"end":$('#end2').val(),
				"n_exp":$('#n_exp').val(),
				"n_gold":$('#n_gold').val(),
				"n_essence":$('#n_essence').val(),
				"m_exp":$('#m_exp').val(),
				"m_gold":$('#m_gold').val(),
				"h_essence":$('#h_essence').val()
			},
			success : function(afkvalue) {
				$('#Exp2').text(afkvalue.totalExp);
				$('#Gold2').text(afkvalue.totalGold);
				$('#Essence2').text(afkvalue.totalEssence);
			 	$('#t_exp2').text(afkvalue.t_exp);
			 	$('#t_gold2').text(afkvalue.t_gold);
			 	$('#t_essence2').text(afkvalue.t_essence);
			 	$('#max_time2').text(afkvalue.max_time);
			 	$('#temp_Max2').text(afkvalue.max_hour+":"+afkvalue.max_min+":"+afkvalue.max_sec);
			 	$.fn.sum();
			 	$.fn.sum_time();
			 	$.fn.sum_MaxTime();
			}
		})
	});
	
	$('#end3').blur(function(){
		$.ajax({
			type:"GET",
			url:"calculator",
			data:{
				"start":$('#start3').val(),
				"end":$('#end3').val(),
				"n_exp":$('#n_exp').val(),
				"n_gold":$('#n_gold').val(),
				"n_essence":$('#n_essence').val(),
				"m_exp":$('#m_exp').val(),
				"m_gold":$('#m_gold').val(),
				"h_essence":$('#h_essence').val()
			},
			success : function(afkvalue) {
				$('#Exp3').text(afkvalue.totalExp);
				$('#Gold3').text(afkvalue.totalGold);
				$('#Essence3').text(afkvalue.totalEssence); 
			 	$('#t_exp3').text(afkvalue.t_exp);
			 	$('#t_gold3').text(afkvalue.t_gold);
			 	$('#t_essence3').text(afkvalue.t_essence);
			 	$('#max_time3').text(afkvalue.max_time);
			 	$('#temp_Max3').text(afkvalue.max_hour+":"+afkvalue.max_min+":"+afkvalue.max_sec);
			 	$.fn.sum();
			 	$.fn.sum_time();
			 	$.fn.sum_MaxTime();
			}
		})
	});
	
	
	$('#end4').blur(function(){
		$.ajax({
			type:"GET",
			url:"calculator",
			data:{
				"start":$('#start4').val(),
				"end":$('#end4').val(),
				"n_exp":$('#n_exp').val(),
				"n_gold":$('#n_gold').val(),
				"n_essence":$('#n_essence').val(),
				"m_exp":$('#m_exp').val(),
				"m_gold":$('#m_gold').val(),
				"h_essence":$('#h_essence').val()
			},
			success : function(afkvalue) {
				$('#Exp4').text(afkvalue.totalExp);
				$('#Gold4').text(afkvalue.totalGold);
				$('#Essence4').text(afkvalue.totalEssence);
			 	$('#t_exp4').text(afkvalue.t_exp);
			 	$('#t_gold4').text(afkvalue.t_gold);
			 	$('#t_essence4').text(afkvalue.t_essence);
			 	$('#max_time4').text(afkvalue.max_time);
			 	$('#temp_Max4').text(afkvalue.max_hour+":"+afkvalue.max_min+":"+afkvalue.max_sec);
			 	$.fn.sum();
			 	$.fn.sum_time();
			 	$.fn.sum_MaxTime();
			}
		})
	});
	
	
	$('#end5').blur(function(){
		$.ajax({
			type:"GET",
			url:"calculator",
			data:{
				"start":$('#start5').val(),
				"end":$('#end5').val(),
				"n_exp":$('#n_exp').val(),
				"n_gold":$('#n_gold').val(),
				"n_essence":$('#n_essence').val(),
				"m_exp":$('#m_exp').val(),
				"m_gold":$('#m_gold').val(),
				"h_essence":$('#h_essence').val()
			},
			success : function(afkvalue) {
				$('#Exp5').text(afkvalue.totalExp);
				$('#Gold5').text(afkvalue.totalGold);
				$('#Essence5').text(afkvalue.totalEssence);
			 	$('#t_exp5').text(afkvalue.t_exp);
			 	$('#t_gold5').text(afkvalue.t_gold);
			 	$('#t_essence5').text(afkvalue.t_essence);
			 	$('#max_time5').text(afkvalue.max_time);
			 	$('#temp_Max5').text(afkvalue.max_hour+":"+afkvalue.max_min+":"+afkvalue.max_sec);
			 	$.fn.sum();
			 	$.fn.sum_time();
			 	$.fn.sum_MaxTime();
			}
		})	   
	});
	
	$.fn.sum=function(){
		var exp1=parseInt($('#Exp').text());
		var exp2=parseInt($('#Exp2').text());
		var exp3=parseInt($('#Exp3').text());
		var exp4=parseInt($('#Exp4').text());
		var exp5=parseInt($('#Exp5').text());
		var gold1=parseInt($('#Gold').text());
		var gold2=parseInt($('#Gold2').text());
		var gold3=parseInt($('#Gold3').text());
		var gold4=parseInt($('#Gold4').text());
		var gold5=parseInt($('#Gold5').text());
		var essence1=parseInt($('#Essence').text());
		var essence2=parseInt($('#Essence2').text());
		var essence3=parseInt($('#Essence3').text());
		var essence4=parseInt($('#Essence4').text());
		var essence5=parseInt($('#Essence5').text());
		
		
		var total_exp=exp1+exp2+exp3+exp4+exp5;
		var total_gold=gold1+gold2+gold3+gold4+gold5;
		var total_essence=essence1+essence2+essence3+essence4+essence5;
		$('#totalExp').text(total_exp);
		$('#totalGold').text(total_gold);
		$('#totalEssence').text(total_essence);
	};
	
	$.fn.sum_time=function(){
		
		var Exp1=$('#t_exp').text().split(':');
		var Exp2=$('#t_exp2').text().split(':');
		var Exp3=$('#t_exp3').text().split(':');
		var Exp4=$('#t_exp4').text().split(':');
		var Exp5=$('#t_exp5').text().split(':');
		var Gold1=$('#t_gold').text().split(':');
		var Gold2=$('#t_gold2').text().split(':');
		var Gold3=$('#t_gold3').text().split(':');
		var Gold4=$('#t_gold4').text().split(':');
		var Gold5=$('#t_gold5').text().split(':');
		var Essence1=$('#t_essence').text().split(':');
		var Essence2=$('#t_essence2').text().split(':');
		var Essence3=$('#t_essence3').text().split(':');
		var Essence4=$('#t_essence4').text().split(':');
		var Essence5=$('#t_essence5').text().split(':');
		
		var Exp_hour=parseInt(Exp1[0])+parseInt(Exp2[0])+parseInt(Exp3[0])+parseInt(Exp4[0])+parseInt(Exp5[0]);
		var Exp_min=parseInt(Exp1[1])+parseInt(Exp2[1])+parseInt(Exp3[1])+parseInt(Exp4[1])+parseInt(Exp5[1]);
		var Exp_sec=parseInt(Exp1[2])+parseInt(Exp2[2])+parseInt(Exp3[2])+parseInt(Exp4[2])+parseInt(Exp5[2]);

		var Gold_hour=parseInt(Gold1[0])+parseInt(Gold2[0])+parseInt(Gold3[0])+parseInt(Gold4[0])+parseInt(Gold5[0]);
		var Gold_min=parseInt(Gold1[1])+parseInt(Gold2[1])+parseInt(Gold3[1])+parseInt(Gold4[1])+parseInt(Gold5[1]);
		var Gold_sec=parseInt(Gold1[2])+parseInt(Gold2[2])+parseInt(Gold3[2])+parseInt(Gold4[2])+parseInt(Gold5[2]);

		var Essence_hour=parseInt(Essence1[0])+parseInt(Essence2[0])+parseInt(Essence3[0])+parseInt(Essence4[0])+parseInt(Essence5[0]);
		var Essence_min=parseInt(Essence1[1])+parseInt(Essence2[1])+parseInt(Essence3[1])+parseInt(Essence4[1])+parseInt(Essence5[1]);
		var Essence_sec=parseInt(Essence1[2])+parseInt(Essence2[2])+parseInt(Essence3[2])+parseInt(Essence4[2])+parseInt(Essence5[2]);
		
		if(Exp_sec>=60){
			Exp_min=Exp_min+parseInt(Exp_sec/60);
			Exp_sec=Exp_sec%60;
		}
		if(Exp_min>=60){
			Exp_hour=Exp_hour+parseInt(Exp_min/60);
			Exp_min=Exp_min%60;
		}
		
		if(Gold_sec>=60){
			Gold_min=Gold_min+parseInt(Gold_sec/60);
			Gold_sec=Gold_sec%60;
		}
		if(Gold_min>=60){
			Gold_hour=Gold_hour+parseInt(Gold_min/60);
			Gold_min=Gold_min%60;
		}
		
		if(Essence_sec>=60){
			Essence_min=Essence_min+parseInt(Essence_sec/60);
			Essence_sec=Essence_sec%60;
		}
		if(Essence_min>=60){
			Essence_hour=Essence_hour+parseInt(Essence_min/60);
			Essence_min=Essence_min%60;
		}
		
		var Exp_Time=Exp_hour+":"+Exp_min+":"+Exp_sec;
		var Gold_Time=Gold_hour+":"+Gold_min+":"+Gold_sec;
		var Essence_Time=Essence_hour+":"+Essence_min+":"+Essence_sec;
		$('#Sum_ExpTime').text(Exp_Time);
		$('#Sum_GoldTime').text(Gold_Time);
		$('#Sum_EssenceTime').text(Essence_Time);
	};
		
	$.fn.sum_MaxTime=function(){
		var max_time=$('#temp_Max').text().split(':');
		var max_time2=$('#temp_Max2').text().split(':');
		var max_time3=$('#temp_Max3').text().split(':');
		var max_time4=$('#temp_Max4').text().split(':');
		var max_time5=$('#temp_Max5').text().split(':');
		var i;
		var time=new Array(3);
		
		for(i=0;i<3;i++){
			time[i]=parseInt(max_time[i])+parseInt(max_time2[i])+parseInt(max_time3[i])+parseInt(max_time4[i])+parseInt(max_time5[i]);
		}
		
		if(time[2]>=60){
			time[1]+=parseInt(time[2]/60);
			time[2]=time[2]%60;
		}
		
		if(time[1]>=60){
			time[0]+=parseInt(time[1]/60);
			time[1]=time[1]%60;
		}
		
		$.ajax({
			type:"GET",
			url:"get_MaxTime",
			data:{
				"max_hour":time[0],
				"max_min":time[1],
				"max_sec":time[2]
			},
			success : function(afkvalue) {
				$('#Sum_Maxtime').text(afkvalue.max_time);
			}
		})
	};
});
