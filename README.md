# Diagrama de Clases del Proyecto - Sistema de Biblioteca

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
        #boolean disponible
        +mostrarDetalles()*
        +obtenerTipo()*
    }

    class Libro {
        -String autor
        -int numPaginas
        +mostrarDetalles()
        +obtenerTipo()
        +prestar()
        +devolver()
    }

    class Revista {
        -int nroEdicion
        +mostrarDetalles()
        +obtenerTipo()
    }

    class Usuario {
        -String idUsuario
        -String nombre
        +solicitarPrestamo()
    }

    class BibliotecaController {
        +listarRecursos()
        +registrarPrestamo()
    }

    Recurso <|-- Libro : extends
    Recurso <|-- Revista : extends
    IPrestable <|.. Libro : implements
    BibliotecaController ..> Recurso : gestiona
    Usuario --> Libro : solicita
