package com.tongtu.ncgl.base.bean;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ahtt_nsj
 * Date: 12-8-9
 * Time: 下午1:48
 * To change this template use File | Settings | File Templates.
 */
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "tableId")
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TableChild {
    @JsonProperty("id")
    private String id;
    @JsonProperty("text")
    private String treeName;//域账户名称
    @JsonProperty("type")
    private String treeType;//域账户名称
    @JsonProperty("expanded")
    private Boolean expanded = false;//打开状态
    @JsonProperty("hasChildren")
    private Boolean hasChildren = false;//打开状态
    @JsonProperty("classes")
    private String classes = TreeStyleEnum.haad.getValue();//样式
    @JsonProperty("children")
    private List<TableChild> childTable;
    public TableChild() {
    }

    public TableChild(String id, String domainName, List<TableChild> childTable) {
        this.id = id;
        this.treeName = domainName;
        this.childTable = childTable;
    }

    public TableChild(String id, String domainName) {
        this.id = id;
        this.treeName = domainName;
    }

    public TableChild(String id, String treeName, String treeType) {
        this.id = id;
        this.treeName = treeName;
        this.treeType = treeType;
    }

    public TableChild(String id, String treeName, String treeType, String classes) {
        this.id = id;
        this.treeName = treeName;
        this.treeType = treeType;
        this.classes = classes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }

    public String getTreeType() {
        return treeType;
    }

    public void setTreeType(String treeType) {
        this.treeType = treeType;
    }

    public List<TableChild> getChildTable() {
        if(this.childTable==null){
            childTable= new ArrayList<TableChild>();
        }
        return childTable;
    }

    public void setChildTable(List<TableChild> childTable) {
        this.childTable = childTable;
    }

    public void addChildDomain(TableChild childTable) {
        if (this.childTable == null)
            this.childTable = new ArrayList<TableChild>();
        this.childTable.add(childTable);
    }

    public Boolean getExpanded() {
        return expanded;
    }

    public void setExpanded(Boolean expanded) {
        this.expanded = expanded;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Boolean getHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
    }
}
