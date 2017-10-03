package br.com.brunomaomeh.model

class Hotel {
    private long id
    private String name

    Hotel() {}

    Hotel(long id, String name) {
        this.id = id
        this.name = name
    }

    long getId() {
        return id
    }

    void setId(long id) {
        this.id = id
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }
}
