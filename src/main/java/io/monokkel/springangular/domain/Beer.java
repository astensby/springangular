package io.monokkel.springangular.domain;

/**
 * Created by astensby on 24/08/14.
 */
public class Beer {

    public long id;
    public String name;
    public String description;

    public Beer(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
