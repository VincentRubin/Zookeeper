package ch.hearc.zookeeper.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandRepository extends JpaRepository <Command, Long> {

}