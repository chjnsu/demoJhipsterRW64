package com.vti.edu.railway.domain;

import javax.persistence.*;
import java.io.Serializable;

public class FanAnime {
    @Entity
    @Table(name = "fan_anime")
    public class User extends AbstractAuditingEntity implements Serializable {

        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "name", length = 50)
        private String name;

        @Column(name = "age", length = 50)
        private String age;

        public User(Long id, String name, String age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getAge() {
            return age;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }
}
