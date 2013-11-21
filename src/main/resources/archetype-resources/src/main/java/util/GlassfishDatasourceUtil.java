package ${package}.util;

import javax.annotation.sql.DataSourceDefinition;
import javax.enterprise.inject.Model;

/**
 * @author oto.junior
 *
 */
@DataSourceDefinition(name="java:app/jdbc/customDS", 
	className="org.h2.jdbcx.JdbcDataSource",	
	url="jdbc:h2:mem:default;DB_CLOSE_ON_EXIT=FALSE;DB_CLOSE_DELAY=-1",
	user="sa",
	password="sa")
@Model
public abstract class GlassfishDatasourceUtil { }
