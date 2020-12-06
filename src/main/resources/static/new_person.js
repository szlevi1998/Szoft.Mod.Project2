function submitnewperson(){

    var myHeaders = new Headers();
    myHeaders.append("Content-Type", "application/json");

    var name = document.getElementById("formNameInput").value;
    var phone = document.getElementById("formPhoneInput").value;
    var city = document.getElementById("formCityInput").value;
    var ado = document.getElementById("formAdoInput").value;
    var gender = document.getElementById("formGenderInput").value;
    var birth = document.getElementById("formBirthInput").value;
    var body = JSON.stringify({name:name,phoneNumber:phone,city:city,tax_number:ado,gender:gender,date_of_birth:birth});


    var requestOptions = {
        method: 'POST',
        headers: myHeaders,
        body: body,
        redirect: 'follow'
    };

    fetch("http://localhost:8080/person", requestOptions)
        .then(response => {
            if (response.status === 200){
                location.reload()
            }
        })
        .catch(error => console.log('error', error));

}