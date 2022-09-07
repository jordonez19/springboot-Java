// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargarUsuarios();
  $('#usuarios').DataTable();
});


  async function cargarUsuarios(){

      const request = await  fetch('/user/1234', {
        method: 'GET',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        }
      });
      const usuarios = await request.json();
      console.log(usuarios);


        let listaUsers = '';
        for (let usuario of usuarios ) {
              let usuarioHTML = '<tr> <td>'+usuario.id+'</td> <td>'+ usuario.nombre +'</td> <td>'+ usuario.email +'</td> <td>'+ usuario.telefono +'</td><td> <a href="#" class="btn btn-danger btn-circle btn-sm"> <i class="fas fa-trash"></i> </a> </td> </tr> ';
            listaUsers += usuarioHTML;
        }

        document.querySelector('#usuarios tbody').outerHTML = listaUsers ;




}


