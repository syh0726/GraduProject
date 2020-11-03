<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet" type="text/css" href="resources/css/afkStyle.css">
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="resources/js/calculator.js"></script>
<title>afk아레나 레벨업 보드</title>
</head>
<body>
<div class="top"><a href="login">[게시판으로]</a>&emsp;&emsp;<a href="hero_info">[영웅 정보]</a></div>
<div class="head">
			afk아레나 레벨업 계산 사이트<br/>
		      계산기 레벨 제한은 500 레벨 까지 입니다.<br/>
		1-240레벨까지는 캐릭터의 수만큼 입력하시고<br/>
		240레벨 이후는 하나의 캐릭터만 설정하시면 됩니다.
</div>	
<div class="content">
				현재 가지고 있는 자원을 입력해 주세요.<br/><br/>
			경험치:<input type="text" id="n_exp" value="0" size="10">&nbsp;&nbsp;&nbsp;골드:<input type="text" value="0" id="n_gold" size="10">&nbsp;&nbsp;&nbsp; 영웅의 가루:<input type="text" id="n_essence" value="0" size="10"><br/><br/>
				현재 분당 자원 획득량을 입력해 주세요.<br/><br/>
			경험치:<input type="text" id="m_exp" value="0" size="10">&nbsp;&nbsp;&nbsp;골드:<input type="text" id="m_gold" value="0" size="10">&nbsp;&nbsp;&nbsp; 영웅의 가루(시간):<input type="text" id="h_essence" value="0" size="10"><br/><br/>
</div>
<div class="middle">			
			&emsp;&nbsp;레벨 범위:&emsp;&emsp;&emsp;&emsp;레벨 범위:&emsp;&emsp;&emsp;&emsp;레벨 범위:&emsp;&emsp;&emsp;&emsp;레벨 범위:&emsp;&emsp;&emsp;&emsp;레벨 범위:<br/>
			<input type="text" id="start"  size="3" >to<input type="text" id="end"  size="3" >&emsp;
			<input type="text" id="start2"  size="3" >to<input type="text" id="end2"  size="3" >&emsp;
			<input type="text" id="start3"  size="3" >to<input type="text" id="end3"  size="3" >&emsp;
			<input type="text" id="start4"  size="3" >to<input type="text" id="end4"  size="3" >&emsp;
			<input type="text" id="start5"  size="3" >to<input type="text" id="end5"  size="3" >&emsp;
</div>
<div class="content2">
<Table>
			<tr class="top">
				<td class="top" colspan="6">필요한 양(need)</td>
				<td>총량(total)</td>
			</tr>
			<tr>
				<td>경험치:</td>
				<td><p id="Exp">0</p>
				<td><p id="Exp2">0</p>
				<td><p id="Exp3">0</p>
				<td><p id="Exp4">0</p>
				<td><p id="Exp5">0</p>
				<td><p id="totalExp">0</p>
			</tr>
			<tr>
				<td>골드:</td>
				<td><p id="Gold">0</p>
				<td><p id="Gold2">0</p>
				<td><p id="Gold3">0</p>
				<td><p id="Gold4">0</p>
				<td><p id="Gold5">0</p>
				<td><p id="totalGold">0</p>
			</tr>
			<tr>
				<td>영웅의 가루:</td>
				<td><p id="Essence">0</p></td>
				<td><p id="Essence2">0</p></td>
				<td><p id="Essence3">0</p></td>
				<td><p id="Essence4">0</p></td>
				<td><p id="Essence5">0</p></td>
				<td><p id="totalEssence">0</p>
			</tr>
</Table>
<br/><br/>
<Table>			
			<tr class="top">
				<td class="top" colspan="7">시간(time)</td>
			</tr>
			<tr>
				<td>경험치:</td>
				<td><p id="t_exp">0:0:0</p></td>
				<td><p id="t_exp2">0:0:0</p></td>
				<td><p id="t_exp3">0:0:0</p></td>
				<td><p id="t_exp4">0:0:0</p></td>
				<td><p id="t_exp5">0:0:0</p></td>
				<td><p id="Sum_ExpTime">0</p>
			</tr>
			<tr>
				<td>골드:</td>
				<td><p id="t_gold">0:0:0</p></td>
				<td><p id="t_gold2">0:0:0</p></td>
				<td><p id="t_gold3">0:0:0</p></td>
				<td><p id="t_gold4">0:0:0</p></td>
				<td><p id="t_gold5">0:0:0</p></td>
				<td><p id="Sum_GoldTime">0</p>
			</tr>
			<tr>
				<td>영웅의 가루:</td>
				<td><p id="t_essence">0:0:0</p></td>
				<td><p id="t_essence2">0:0:0</p></td>
				<td><p id="t_essence3">0:0:0</p></td>
				<td><p id="t_essence4">0:0:0</p></td>
				<td><p id="t_essence5">0:0:0</p></td>
				<td><p id="Sum_EssenceTime">0</p>
			</tr>
</Table>	
<br/><br/>		
<Table>
			<tr class="top">
				<td class="top" colspan="7">최대 시간(max)</td>
			</tr>
			<tr>
				<td>합계:</td>
				<td><p id="max_time">0</p></td>
				<td><p id="max_time2">0</p></td>
				<td><p id="max_time3">0</p></td>
				<td><p id="max_time4">0</p></td>
				<td><p id="max_time5">0</p></td>
				<td><p id="Sum_Maxtime">0</p>
			</tr>
</Table>	
			
</div>
<div class="tail">
	<div id="temp_Max">0:0:0</div>
	<div id="temp_Max2">0:0:0</div>
	<div id="temp_Max3">0:0:0</div>
	<div id="temp_Max4">0:0:0</div>
	<div id="temp_Max5">0:0:0</div>
</div>
</body>
</html>