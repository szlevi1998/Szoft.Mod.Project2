function submitnewcategory(){

    var myHeaders = new Headers();
    myHeaders.append("Content-Type", "application/json");

    var catname = document.getElementById("formGroupCatNameInput").value;
    var raw = JSON.stringify({name:catname});

    var requestOptions = {
        method: 'POST',
        headers: myHeaders,
        body: raw,
        redirect: 'follow'
    };

    fetch("http://localhost:8080/category", requestOptions)
        .then(response => {
            if (response.status === 200){
                location.reload()
            }
        })
        .catch(error => console.log('error', error));

}