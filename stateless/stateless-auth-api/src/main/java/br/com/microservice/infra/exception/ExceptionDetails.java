package br.com.microservice.infra.exception;

public record ExceptionDetails(int status, String message) {
}