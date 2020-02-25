(ns myapp.main
  (:require ["react-native" :as rn]
            [helix.core :refer [defnc $]]
            [helix.experimental.refresh :as refresh]))

(refresh/inject-hook!)

(defn ^:dev/after-load after-load []
  (refresh/refresh!))

(defnc Root [props]
  {:helix/features {:fast-refresh true}}
  ($ rn/View {:style #js {:flex 1, :alignItems "center", :justifyContent "center"}}
     ($ rn/Text {:style #js {:fontSize 36}}
        "Hello Helix!")))

(defn init []
  (rn/AppRegistry.registerComponent "MyApp" (fn [] Root)))
