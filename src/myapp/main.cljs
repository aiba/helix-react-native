(ns myapp.main
  (:require ["react-native" :as rn]
            [helix.core :refer [defnc $]]))

(defnc Root [props]
  {:helix/features {:fast-refresh true}}
  ($ rn/View {:style #js {:flex 1, :alignItems "center", :justifyContent "center"}}
     ($ rn/Text {:style #js {:fontSize 36}}
        "Hello Helix!")))

(defn init []
  (rn/AppRegistry.registerComponent "MyApp" (fn [] Root)))
