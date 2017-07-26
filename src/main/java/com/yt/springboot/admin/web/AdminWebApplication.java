package com.yt.springboot.admin.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.config.EnableAdminServer;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class AdminWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminWebApplication.class, args);
	}
/*
	@Configuration
	public static class NotifierConfig {
		@Bean
		@Primary
		public RemindingNotifier remindingNotifier() {
			RemindingNotifier notifier = new RemindingNotifier(filteringNotifier(loggerNotifier()));
			notifier.setReminderPeriod(TimeUnit.SECONDS.toMillis(10));
			return notifier;
		}

		@Scheduled(fixedRate = 1_000L)
		public void remind() {
			remindingNotifier().sendReminders();
		}

		@Bean
		public FilteringNotifier filteringNotifier(Notifier delegate) {
			return new FilteringNotifier(delegate);
		}

		@Bean
		public LoggingNotifier loggerNotifier() {
			return new LoggingNotifier();
		}
	}*/
}
