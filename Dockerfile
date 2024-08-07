FROM postgres:latest

# Set environment variables
ENV POSTGRES_USER=postgres
ENV POSTGRES_PASSWORD=1234
ENV POSTGRES_DB=mydatabase

# Expose the default PostgreSQL port
EXPOSE 5432

# Copy initialization script (optional)
COPY init.sql /docker-entrypoint-initdb.d/

# Optional: Add healthcheck to monitor database
HEALTHCHECK --interval=10s --timeout=5s --retries=3 \
  CMD pg_isready -U postgres -h 127.0.0.1 -p 5432