package org.quivient.dao.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration Spring pour la couche d'accès aux données (DAO).
 *Z
 * @author freboul
 */

@Configuration
@EntityScan(basePackages = "org.quivient.dao.entity")
@EnableJpaRepositories(basePackages = "org.quivient.dao.repository")
public class SpringDaoConfig {

}
