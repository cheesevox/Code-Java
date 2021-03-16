<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<aside class="col-right">
	<div class="box">
            <c:if test="${sessionScope.USERNAME ==null}">
                <%@include file="index.jsp" %>
            </c:if>
            <c:if test="${sessionScope.ROLE eq 'admin'}">
                <h2>Welcome, ${sessionScope.USERNAME}</h2>
            </c:if>
	</div>
	
	<div class="box">
		<h2>Lorem ipsum dolor</h2>
		Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Vivamus venenatis.
		
		<hr>
		
		<h2>Social</h2>
		<div class="font-awesome">
			<a href="#"><i class="fa fa-facebook-square fa-2x" aria-hidden="true"></i></a>
			<a href="#"><i class="fa fa-twitter-square fa-2x" aria-hidden="true"></i></a>
			<a href="#"><i class="fa fa-pinterest-square fa-2x" aria-hidden="true"></i></a>
			<a href="#"><i class="fa fa-google-plus-square fa-2x" aria-hidden="true"></i></a>
			<a href="#"><i class="fa fa-linkedin-square fa-2x" aria-hidden="true"></i></a>
			<a href="#"><i class="fa fa-tumblr-square  fa-2x" aria-hidden="true"></i></a>
		</div>
		<hr>
		<div class="font-awesome">
			<a href="#"><i class="fa fa-cc-mastercard fa-2x" aria-hidden="true"></i></a>
			<a href="#"><i class="fa fa-cc-visa fa-2x" aria-hidden="true"></i></a>
			<a href="#"><i class="fa fa-cc-discover fa-2x" aria-hidden="true"></i></a>
			<a href="#"><i class="fa fa-cc-paypal fa-2x" aria-hidden="true"></i></a>
		</div>
	</div>
</aside>
</div>