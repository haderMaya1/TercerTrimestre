using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace asp1.Models
{
    public class Usuario
    {
        [Key]
        //Identificador unico
        public int Id { get; set; }

        [Required(ErrorMessage = "El Campo es obligatorio")]
        public string Nombre { get; set; }

        [Required(ErrorMessage = "El Campo es obligatorio")]
        [Display(Name ="Teléfono")]
        public string Telefono { get; set; }

        [Required(ErrorMessage = "El Campo es obligatorio")]
        public string Celular { get; set; }

        [Required(ErrorMessage = "El Campo es obligatorio")]
        public string Email { get; set; }


    }
}
