package com.rajeeda.coopmis.data.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "it_group_permission", schema = "public", catalog = "db_coopmis")
public class ItGroupPermission {
    private int id;
    private Integer permissionId;
    private Integer groupId;
    private Boolean permission;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "permission_id")
    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    @Basic
    @Column(name = "group_id")
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "permission")
    public Boolean getPermission() {
        return permission;
    }

    public void setPermission(Boolean permission) {
        this.permission = permission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItGroupPermission that = (ItGroupPermission) o;
        return id == that.id &&
                Objects.equals(permissionId, that.permissionId) &&
                Objects.equals(groupId, that.groupId) &&
                Objects.equals(permission, that.permission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, permissionId, groupId, permission);
    }
}
