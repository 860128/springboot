package com.domain;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * All rights Reserved, Designed By www.xakrsoft.com
 *
 * @author 白羊
 * @ClassName Test
代表了实体类
 */
@Entity
@Table(name = "student")
public class Test implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id//代表主键
    @GeneratedValue//使主键自增
    private Long id;
    @Column(name = "sname")
    private String sname;
    @Column(name = "cid")
    private String cid;

    public Test() {
        super();
    }

    public Test(String sname, String cid) {
        super();
        this.sname = sname;
        this.cid = cid;
    }

    public Long GetId() {
        return id;
    }

    public void SetId(Long id) {
        this.id = id;
    }

    public String GetSname() {
        return sname;
    }

    public void SetSname(String sname) {
        this.sname = sname;
    }

    public String GetCid() {
        return cid;
    }

    public void SetCid(String cid) {
        this.cid = cid;
    }

}
