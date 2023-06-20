<!DOCTYPE html>
<html>
<head>
    <title>Product Details</title>
</head>
<body>
    <h1>Product Details</h1>
    <c:if test="${empty product}">
        <p>No product details available.</p>
    </c:if>
    <c:if test="${not empty product}">
        <p><b>Name:</b> ${product.name}</p>
        <p><b>Price:</b> ${product.price}</p>
        <p><b>Description:</b> ${product.description}</p>
    </c:if>
    <a href="productForm.jsp">Back to Product Form</a>
</body>
</html>
