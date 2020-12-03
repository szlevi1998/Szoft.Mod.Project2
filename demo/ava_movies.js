var myHeaders = new Headers();
myHeaders.append("Content-Type", "application/json");

var title = document.getElementById("movie_name").value;
var rating = document.getElementById("rating_movie").value;
var category = document.getElementById("category1").value;
var release = document.getElementById("release").value;
var raw = JSON.stringify({name:title,rating:rating,year:release,category:category});

var requestOptions = {
    method: 'POST',
    headers: myHeaders,
    body: raw,
    redirect: 'follow'
};

fetch("http://localhost:8080/ava_movies", requestOptions)
    .then(response => response.text())
    .then(result => console.log(result))
    .catch(error => console.log('error', error));