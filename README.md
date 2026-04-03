# Diagrama de Clases del Proyecto - Sistema de Biblioteca v2.0

```mermaid
classDiagram
    class IPrestable {
        <<interface>>
        +prestar()
        +devolver()
    }

    class Recurso {
        <<abstract>>
        #String codigo
        #String titulo
        #String editorial
        #int anioPublicacion
        #boolean disponible
        +mostrarDetalles()*
        +obtenerTipo()*
    }

    class Autor {
        -String idAutor
        -String nombre
        -String nacionalidad
        +obtenerBiografia()
    }

    class Libro {
        -Autor autor
        -String isbn
        -int numPaginas
        -String genero
        +mostrarDetalles()
        +prestar()
    }

    class Revista {
        -int nroEdicion
        -String periodicidad
        +mostrarDetalles()
    }

    class Usuario {
        -String idUsuario
        -String nombre
        -String correo
        +solicitarPrestamo()
    }

    class BibliotecaController {
        +listarRecursos()
        +buscarPorAutor(Autor autor)
        +registrarPrestamo()
    }

    Recurso <|-- Libro : extends
    Recurso <|-- Revista : extends
    Libro --> Autor : tiene un
    IPrestable <|.. Libro : implements
    BibliotecaController ..> Recurso : gestiona
    Usuario --> Libro : solicita
