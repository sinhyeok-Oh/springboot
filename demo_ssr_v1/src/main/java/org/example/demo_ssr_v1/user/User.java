package org.example.demo_ssr_v1.user;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

// 엔티티 화면 보고 설계하기
@Data
@NoArgsConstructor
@Table(name= "user_tb")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private String username;

    // pc --> db
    @CreationTimestamp
    private Timestamp createdAt;
}
