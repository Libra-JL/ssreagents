<%--
  Created by IntelliJ IDEA.
  User: Libra
  Date: 2021/3/30
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="virusform">
    <form action="" method="post">
        <table border="1px solid #ccc" cellspacing="0" cellpadding="0">
            <tr>
                <td width="150px" height="40px">属性</td>
                <td width="300px" height="40px">内容</td>
                <td width="150px" height="40px">属性</td>
                <td width="300px" height="40px">内容</td>

            </tr>
            <tr>
                <td width="100px" height="40px">品牌</td>
                <td width="100px" height="40px">
                    <select name="brand">
                        <option value="请选择">--请选择品牌--</option>
                        <option value="维真">维真</option>
                        <option value="维真1">维真1</option>
                        <option value="维真2">维真2</option>
                    </select>
                </td>
                <td width="100px" height="40px">产品名称</td>
                <td width="100px" height="40px">
                    <input width="96" type="text" name="product_name">
                </td>
            </tr>
            <tr>
                <td width="100px" height="40px">货号</td>
                <td width="100px" height="40px">
                    <input width="96" type="text" name="goods_num">
                </td>
                <td width="100px" height="40px">批次号</td>
                <td width="100px" height="40px">
                    <input width="96" type="text" name="batch_num">
                </td>
            </tr>
            <tr>
                <td width="100px" height="40px">规格</td>
                <td width="100px" height="40px">
                    <input width="96" type="text" name="batch_num">μl
                </td>
                <td width="100px" height="40px">价格</td>
                <td width="100px" height="40px">
                    <input width="96" type="text" name="batch_num">元
                </td>
            </tr>
            <tr>
                <td width="100px" height="40px">货期</td>
                <td width="100px" height="40px">
                    <input width="96" type="text" name="batch_num">周
                </td>
                <td width="100px" height="40px">有效期</td>
                <td width="100px" height="40px">
                    <input width="96" type="text" name="batch_num">年
                </td>
            </tr>


            <%--ajax--%>
            <tr>
                <td width="100px" height="40px">血清型</td>
                <td width="100px" height="40px">
                    <select>
                        <option value="--请选择血清型--">--请选择血清型--</option>
                        <option value="rAAV2/1">rAAV2/1</option>
                        <option value="rAAV2/2">rAAV2/2</option>
                        <option value="rAAV2/3">rAAV2/3</option>
                        <option value="rAAV2/4">rAAV2/4</option>
                        <option value="rAAV2/5">rAAV2/5</option>
                        <option value="rAAV2/6">rAAV2/6</option>
                        <option value="rAAV2/7">rAAV2/7</option>
                        <option value="AAV2/8">rAAV2/8</option>
                        <option value="rAAV2/9">rAAV2/9</option>
                        <option value="aav-retro">Raav-retro</option>
                        <option value="AV-PHP.eB">AAV-PHP.eB</option>
                        <option value="AAV-PHP.S">AAV-PHP.S</option>
                        <option value="AV-PAN">AAV-PAN</option>
                        <option value="AAV-LUNG">AAV-LUNG</option>
                        <option value="AAV-DJ">AAV-DJ</option>
                        <option value="AAV-7m">AAV-7m8</option>
                        <option value="AAV-ShH10Y">AAV-ShH10Y</option>
                        <option value="AAV-Rh10">AAV-Rh10</option>
                        <option value="3XMCK">AAV-Anc80L65</option>
                    </select>
                </td>
                <td width="100px" height="40px">启动子</td>
                <td width="100px" height="40px">
                    <select>
                        <option value="rAAV2/1">--请选择启动子--</option>
                        <option value="UBC">UBC</option>
                        <option value="TBG">TBG</option>
                        <option value="SST">SST</option>
                        <option value="RPE65">RPE65</option>
                        <option value="PGK">PGK</option>
                        <option value="NSE">NSE</option>
                        <option value="MECP2">MECP2</option>
                        <option value="MCK">MCK</option>
                        <option value="MBP">MBP</option>
                        <option value="INSULIN">INSULIN</option>
                        <option value="HCRAopE-hAAT">HCRAopE-hAAT </option>
                        <option value="GFAP104">GFAP104</option>
                        <option value="GFAP">GFAP</option>
                        <option value="EFFS">EFFS</option>
                        <option value="EF1a">EF1a</option>
                        <option value="cTNT">cTNT</option>
                        <option value="CK1.3">CK1.3</option>
                        <option value="CK0.4">CK0.4</option>
                        <option value="c-fos">c-fos</option>
                        <option value="CamKIIa">CamKIIa</option>
                        <option value="CAG">CAG</option>
                        <option value="aMHC">aMHC</option>
                        <option value="ALB">ALB</option>
                        <option value="3XMCK">3XMCK</option>

                    </select>
                </td>
            </tr>
            <tr>
                <td width="100px" height="40px">元件</td>
                <td width="100px" height="40px">
                    <select>
                        <option value="--请选择元件--">--请选择元件--</option>
                        <option value="tTA">tTA</option>
                        <option value="RFP">RFP</option>
                        <option value="mCherry">mCherry</option>
                        <option value="LacZ">LacZ</option>
                        <option value="GFP">GFP</option>
                        <option value="DIO-RFP">DIO-RFP</option>
                        <option value="DIO-mCherry">DIO-mCherry</option>
                        <option value="Dio-LacZ">Dio-LacZ</option>
                        <option value="Dio-GFP">Dio-GFP</option>
                        <option value="DIO">DIO</option>
                        <option value="Cre">Cre</option>
                    </select>
                </td>
                <td width="100px" height="40px">荧光标签</td>
                <td width="100px" height="40px">
                    <select>
                        <option value="请选择荧光标签">--请选择荧光标签--</option>
                        <option value="GFP">GFP</option>
                        <option value="RFP">RFP</option>
                        <option value="mCherry">mCherry</option>
                        <option value="tdTomato">tdTomato</option>
                        <option value="YFP">YFP</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td width="100px" height="40px">基因编号</td>
                <td width="100px" height="40px">
                    <input width="96" type="text" name="goods_num">
                </td>
                <td width="100px" height="40px">基因名称</td>
                <td width="100px" height="40px">
                    <input width="96" type="text" name="goods_num">
                </td>
            </tr>
            <tr>
                <td width="100px" height="40px">基因大小</td>
                <td width="100px" height="40px">
                    <input width="96" type="text" name="goods_num">
                </td>
                <td width="100px" height="40px">抗性基因</td>
                <td width="100px" height="40px">
                    <input width="96" type="text" name="goods_num">
                </td>
            </tr>
            <tr>
                <td width="100px" height="40px">存放说明</td>
                <td width="100px" height="40px">
                    <textarea></textarea>
                </td>
                <td width="100px" height="40px">qPCR滴度</td>
                <td width="100px" height="40px">
                    <input width="96" type="text" name="goods_num">
                </td>
            </tr>
            <tr>
                <td width="100px" height="40px">银染滴度</td>
                <td width="100px" height="40px">
                    <input width="96" type="text" name="goods_num">
                </td>
                <td width="100px" height="40px">哪些文献中使用过</td>
                <td width="100px" height="40px">
                    <input width="96" type="text" name="goods_num">
                </td>
            </tr>
            <tr>
                <td width="100px" height="40px">应用</td>
                <td width="100px" height="40px">
                    <input width="96" type="text" name="goods_num">
                </td>
                <td width="100px" height="40px">应用对象品系</td>
                <td width="100px" height="40px">
                    <input width="96" type="text" name="goods_num">
                </td>
            </tr>
            <tr>
                <td width="100px" height="40px">组织</td>
                <td width="100px" height="40px">
                    <input width="96" type="text" name="goods_num">
                </td>
                <td width="100px" height="40px">应用方式</td>
                <td width="100px" height="40px">
                    <input width="96" type="text" name="goods_num">
                </td>
            </tr>
            <tr>
                <td width="100px" height="40px">体积</td>
                <td width="100px" height="40px">
                    <input width="96" type="text" name="goods_num">μl
                </td>
                <td width="100px" height="40px">感染时间</td>
                <td width="100px" height="40px">
                    <input width="96" type="text" name="goods_num">
                </td>
            </tr>
            <tr>
                <td width="100px" height="40px">是否达到预期目标</td>
                <td width="100px" height="40px">
                    <input type="radio" name="is_achieve_goal" value="1">1
                    <input type="radio" name="is_achieve_goal" value="2">2
                    <input type="radio" name="is_achieve_goal" value="3">3
                    <input type="radio" name="is_achieve_goal" value="4">4
                    <input type="radio" name="is_achieve_goal" value="5">5
                </td>
                <td width="100px" height="40px">性价比</td>
                <td width="100px" height="40px">
                    <input type="radio" name="cost_performance" value="1">1
                    <input type="radio" name="cost_performance" value="2">2
                    <input type="radio" name="cost_performance" value="3">3
                    <input type="radio" name="cost_performance" value="4">4
                    <input type="radio" name="cost_performance" value="5">5
                </td>
            </tr>
            <tr>
                <td width="100px" height="40px">总体评价</td>
                <td width="100px" height="40px">
                    <input type="radio" name="overall_evaluation" value="1">1
                    <input type="radio" name="overall_evaluation" value="2">2
                    <input type="radio" name="overall_evaluation" value="3">3
                    <input type="radio" name="overall_evaluation" value="4">4
                    <input type="radio" name="overall_evaluation" value="5">5
                </td>
                <td width="100px" height="40px">评论</td>
                <td width="100px" height="40px">
                    <textarea></textarea>
                </td>
            </tr>

            <tr>
                <td width="100px" height="40px">附图说明</td>
                <td width="100px" height="40px">
                    <textarea></textarea>
                </td>
                <td width="100px" height="40px">购买链接</td>
                <td width="100px" height="40px">
                    <input type="text">
                </td>
            </tr>
            <tr>
                <td width="100px" height="40px">图片上传</td>
                <td width="100px" height="40px"><input type="file"></td>
                <td width="100px" height="40px" colspan="2"><input type="submit" value="提交"></td>

            </tr>

        </table>

    </form>
</div>

</body>
</html>
