Rails.application.routes.draw do
  # Define your application routes per the DSL in https://guides.rubyonrails.org/routing.html

  # Defines the root path route ("/")
  root :controller =>'hello', :action=>"hello"
  get '/hello', :controller=>"hello", :action=>"hello"
  post 'say_hello', :controller=>'hello', :action=>'say_hello'
end
