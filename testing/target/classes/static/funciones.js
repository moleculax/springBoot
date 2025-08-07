
function eliminar(id){
	swal({
	  title: "Esta Seguro de Eliminar?",
	  text: "El registro se eliminara permanentemente de la BD",
	  icon: "warning",
	  buttons: true,
	  dangerMode: true,
	})
	.then((OK) => {
	  if (OK) {
		$.ajax({
			url:"/eliminar/"+id,
			success: function(res){
				console.log(res);
			}
		})
	    swal("Accion ejecutada con exito", {
	      icon: "success",
	    }).then((ok) => {
			if(ok){
				location.href="/listar";
			}
		}); 
	  } else {
	    swal("Operacion cancelada");
	  }
	});
}