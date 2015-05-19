(ns asana.users
  (:require [org.httpkit.client :as http]
            [asana.core :refer [api-call]]))

(def ^:dynamic end-point "users")

(defn get-users
  "Get info about all users in organization."
  [& [options]]
  (api-call :get "users" nil options))

(defn user
  "Get info about a user."
  [user & [options]]
  (api-call :get "users/%s" [user] options))

(defn me
  "Get info about the current authorized user."
  (api-call :get "users/me" nil options))
