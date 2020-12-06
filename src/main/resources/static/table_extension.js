fetch("http://localhost:8080/ava_movies", {method: 'GET'})
    .then(response => response.json())
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
            cell1.innerHTML = element.id
            cell2.innerHTML = element.name
            cell3.innerHTML = element.category
            cell4.innerHTML = element.rating
            cell5.innerHTML = element.year

            let cell6 = row.insertCell(5)

            cell6.innerHTML = "<button class=\"btn btn-danger\" onClick = \"deletebyID("+element.id + ")\">X</button>"

        }
    })
    .catch(error => console.log('error', error));

function deletebyID(id){
fetch("http://localhost:8080/ava_movies/" + id, {method: 'DELETE'})
    .then(response => {
        if(response.status === 200){
            alert("Movie successfully deleted")
            location.reload()
        }
    })
}