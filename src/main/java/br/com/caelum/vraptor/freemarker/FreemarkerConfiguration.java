package br.com.caelum.vraptor.freemarker;

import br.com.caelum.vraptor4.ioc.ApplicationScoped;
import freemarker.cache.ClassTemplateLoader;
import freemarker.template.Configuration;

@ApplicationScoped
public class FreemarkerConfiguration {

	private final Configuration cfg;

	public FreemarkerConfiguration() {
		cfg = new Configuration();
		ClassTemplateLoader loader = new ClassTemplateLoader(getClass(), "/templates/");
		cfg.setTemplateLoader(loader);
		cfg.setDefaultEncoding("UTF-8");
	}

	public Configuration getConfiguration() {
		return cfg;
	}

}
