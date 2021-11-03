package br.com.devdojo.awesome.error;

import javax.annotation.Generated;

public class ResourceNotFoundDetails {
	private String title;
	private int status;
	private String details;
	private long timestamp;
	private String developerMessage;

	@Generated("SparkTools")
	private ResourceNotFoundDetails(Builder builder) {
		this.title = builder.title;
		this.status = builder.status;
		this.details = builder.details;
		this.timestamp = builder.timestamp;
		this.developerMessage = builder.developerMessage;
	}

	private ResourceNotFoundDetails() {
	}
	
	
		public String getTitle() {
		return title;
	}

	public int getStatus() {
		return status;
	}

	public String getDetails() {
		return details;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public String getDeveloperMessage() {
		return developerMessage;
	}


	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	@Generated("SparkTools")
	public static final class Builder {
		private String title;
		private int status;
		private String details;
		private long timestamp;
		private String developerMessage;

		private Builder() {
		}

		public Builder withTitle(String title) {
			this.title = title;
			return this;
		}

		public Builder withStatus(int status) {
			this.status = status;
			return this;
		}

		public Builder withDetails(String details) {
			this.details = details;
			return this;
		}

		public Builder withTimestamp(long timestamp) {
			this.timestamp = timestamp;
			return this;
		}

		public Builder withDeveloperMessage(String developerMessage) {
			this.developerMessage = developerMessage;
			return this;
		}

		public ResourceNotFoundDetails build() {
			return new ResourceNotFoundDetails(this);
		}
	}
	

}
