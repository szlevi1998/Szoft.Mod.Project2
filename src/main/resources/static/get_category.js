fetch("http://localhost:8080/category", {method: 'GET'})
    .then(response => response.json())
    .then(response => {
        let table= document.getElementById("myCatTable")
        for (let i = 0; i<response.length; i++){
            let element = response[i]
            let row = table.insertRow(0)
            let cell1 = row.insertCell(0)
            cell1.innerHTML = element.name

            let cell2 = row.insertCell(1)

            cell2.innerHTML = "<button class=\"btn btn-danger\" onClick = \"deletebyID("+element.id + ")\">X</button>"

        }
    })
    .catch(error => console.log('error', error));

function deletebyID(id){
    fetch("http://localhost:8080/category/" + id, {method: 'DELETE'})
        .then(response => {
            if(response.status === 200){
                alert("Category successfully deleted")
                location.reload()
            }
        })
}