package com.rajeeda.coopmis.data.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "it_permission", schema = "public", catalog = "db_coopmis")
public class ItPermission {
    private int id;
    private String permissionName;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "permission_name")
    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItPermission that = (ItPermission) o;
        return id == that.id &&
                Objects.equals(permissionName, that.permissionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, permissionName);
    }
}
