document.getElementById("search-filter").onclick = function(event){

    removeProducts();

    const searchTerm = document.getElementById('search').value;
    console.log(searchTerm);

    $.ajax({
        type: "GET",
        url: "http://localhost:8080/api/products?searchTerm=" + encodeURIComponent(searchTerm),
        cors: true,
        success: function(products){addProductstoPage(products)},
        error: function(error){console.error(error)}
    });
};