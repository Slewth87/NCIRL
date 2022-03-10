Rails.application.routes.draw do
  # Define your application routes per the DSL in https://guides.rubyonrails.org/routing.html

  # Defines the root path route ("/")
  # root "articles#index"
  get '/light_switch', :controller => 'light_switch', :action => "switch"
  post 'light_switch', :controller => 'light_switch', :action => "switch"
  get '/another_page', :controller => 'light_switch', :action => "another_page"
  get 'hidden_light_switch', :controller => 'light_switch', :action => 'hidden_light_switch'
end
