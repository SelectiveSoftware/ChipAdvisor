CREATE TABLE reviews
(
  id              UUID            NOT NULL,
  location_id     UUID            NOT NULL,
  user_id         UUID            NOT NULL,
  name            VARCHAR(120),
  image           VARCHAR(512),
  overall_rating  INT             NOT NULL,
  description     TEXT,
  enabled         BOOLEAN,
  created_at      TIMESTAMP WITHOUT TIME ZONE NOT NULL DEFAULT NOW(),
  updated_at      TIMESTAMP WITHOUT TIME ZONE NOT NULL DEFAULT NOW(),
  PRIMARY KEY (id),
  FOREIGN KEY (location_id) REFERENCES locations(id),
  FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE TABLE locations
(
  id              UUID            NOT NULL,
  name            VARCHAR(120),
  lat             DECIMAL(10, 8)  NOT NULL,
  lng             DECIMAL(11, 8)  NOT NULL,
  description     TEXT,
  url             VARCHAR(255),
  created_at      TIMESTAMP WITHOUT TIME ZONE NOT NULL DEFAULT NOW(),
  updated_at      TIMESTAMP WITHOUT TIME ZONE NOT NULL DEFAULT NOW(),
  PRIMARY KEY (id)
);

CREATE TABLE users (
  id              UUID            NOT NULL,
  ip              BINARY(16),
  created_at      TIMESTAMP WITHOUT TIME ZONE NOT NULL DEFAULT NOW(),
  updated_at      TIMESTAMP WITHOUT TIME ZONE NOT NULL DEFAULT NOW(),
);
