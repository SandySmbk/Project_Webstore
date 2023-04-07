/*console.log("Produkte wurden geladen/index.js");


function createProduct(product) {
    // card container 
    const cardContainer = $("<div>", { class: "col-12 col-lg-4 col-xxl-3 d-flex justify-content-center mb-3" });
    //card element
    const card = $(`<div class="card border border-light text-black p-3" style="width: 20rem;"></div>`);
    //image element
    //const image = $(`<img class="card-img-top border border-light rounded" height="250" src="${product.imageUrl}">`);
    //card body element
    const cardBody = $(`<div class="card-body border rounded mt-1"></div>`);
    //name element
    const name = $(`<h5 class="card-title text-center">${product.name}</h5>`);
    //description element
    const description = $(`<p class="card-text">${product.description}</p>`);
    //price element
    const price = $(`<p class="card-text">${product.price}</p>`);

    //Append the elements to the card
    cardBody.append(name);
    cardBody.append(description);
    cardBody.append(price);
    card.append(image);
    card.append(cardBody);
    //append the card to the container
    cardContainer.append(card);
    return cardContainer;
}

function addProductstoPage(products) {
    const productContainer = $("#productsContainer");

    for (let product of products) {
        productContainer.append(createProduct(product))
    }
}

$(document).ready(function(){
    function createProduct(product) {
    }
    $.ajax({
        url:'http://localhost:8080/api/products',
        method:'GET',
        cors: true,
        success: function (products) { addProductstoPage(products) },
        error: function (error) { console.error(error) }
    });
});

*/

$(document).ready(function() {
$.get({
    url: 'http://localhost:8080/api/products',
    cors: true, // CORS enabled
    success: function (products) { addProductstoPage(products) }, // On success, add the products to the page
    error: console.error
});
$('#searchBtn').on('click', function() {
    const query = $('#searchInput').val().toLowerCase().trim();
    if (query.length > 0) {
      // Send search request to API
      $.get({
        url: `http://localhost:8080/api/products?search=${query}`,
        cors: true,
        success: function(products) {
          // Display search results
          removeProducts();
          addProductstoPage(products);
        },
        error: console.error
      });
    }
  });
});

function addProductstoPage(products) {
    const productContainer = $("#productsContainer"); // Selects the product container element
    productContainer.empty();

    let row;
    for (let i = 0; i < products.length; i++) {
        if (i % 3 === 0) {
            row = $('<div class="row justify-content-center mt-3"></div>');
            productContainer.append(row);
        }
        row.append(createProduct(products[i]));
    }
}

function createProduct(product) {

    // card container 
    const cardContainer = $("<div>", { class: "col-12 col-lg-4 col-xxl-3 d-flex justify-content-center mb-3" });
    //card element
    const card = $(`<div class="card border border-light text-black p-3" style="width: 20rem;"></div>`);
    //image element
    //const image = $(`<img class="card-img-top border border-light rounded" height="250" src="${product.imageUrl}">`);
    //card body element
    const cardBody = $(`<div class="card-body border rounded mt-1"></div>`);
    //name element
    const name = $(`<h5 class="card-title text-center">${product.name}</h5>`);
    //description element
    const description = $(`<p class="card-text">${product.description}</p>`);
    //price element
    const price = $(`<p class="card-text">${product.price}</p>`);

    //Append the elements to the card
    cardBody.append(name);
    cardBody.append(description);
    cardBody.append(price);
    //card.append(image);
    card.append(cardBody);
    //append the card to the container
    cardContainer.append(card);
    return cardContainer;
}

function removeProducts() {
    $("#productsContainer").empty();
}