
init-react-native:
	npx react-native@0.61.5 init MyApp
	mv MyApp react-native


clean:
	rm -rf .shadow-cljs react-native/target

shadow:
	npx shadow-cljs@2.8.85 watch dev

repl:
	npx shadow-cljs@2.8.85 cljs-repl dev

bundler:
	cd react-native && yarn start --reset-cache

ios:
	cd react-native && yarn ios
