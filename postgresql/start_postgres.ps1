#!/usr/bin/env pwsh

# Enable strict mode for error handling
Set-StrictMode -Version Latest

# Create the directory for PostgreSQL data
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\.local\docker\postgresql\data"

# Run the PostgreSQL container
docker run --rm --name pg-docker -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=local -d -p 5432:5432 -e PGDATA=/var/lib/postgresql/data/pgdata -v "$env:USERPROFILE\.local\docker\postgresql\data:/var/lib/postgresql/data" postgres

# Then run: "docker exec -it pg-docker /bin/bash", "psql -d local postgres"
# Once done: "\quit", "exit"