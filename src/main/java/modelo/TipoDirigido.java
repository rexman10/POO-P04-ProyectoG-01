package modelo;

public enum TipoDirigido {
    PERRO("Perro"),
    GATO("Gato"),
    TODOS("Todos");

    final String dirigidoTipo;

    TipoDirigido(String entrada) {
        this.dirigidoTipo = entrada;
    }
}