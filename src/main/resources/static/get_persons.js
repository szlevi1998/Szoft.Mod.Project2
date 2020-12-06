fetch("http://localhost:8080/person", {method: 'GET'})
    .then(response => response.json())
    .then(response => response.data)
    .then(response => {
        let table= document.getElementById("myTable")
        for (let i = 0; i<response.length; i++){
            let element = response[i]
            let row = table.insertRow(0)
            let cell1 = row.insertCell(0)
            let cell2 = row.insertCell(1)
            let cell3 = row.insertCell(2)
            let cell4 = row.insertCell(3)
            let cell5 = row.insertCell(4)
            let cell6 = row.insertCell(5)
            cell1.innerHTML = element.name
            cell2.innerHTML = element.phoneNumber
            cell3.innerHTML = element.city
            cell4.innerHTML = element.tax_number
            cell5.innerHTML = element.gender
            cell6.innerHTML = element.date_of_birth

            let cell7 = row.insertCell(6)

            cell7.innerHTML = "<button class=\"btn btn-danger\" onClick = \"deletebyID("+element.id + ")\">X</button>"

        }
    })
    .catch(error => console.log('error', error));

function deletebyID(id){
    fetch("http://localhost:8080/person/" + id, {method: 'DELETE'})
        .then(response => {
            if(response.status === 200){
                alert("Person successfully deleted")
                location.reload()
            }
        })
}