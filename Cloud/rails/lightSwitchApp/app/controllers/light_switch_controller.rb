class LightSwitchController < ApplicationController

    def switch
        @light_switch = params[:status] == 'true'
    end

    def another_page
        render 'light_switch/page'
    end

    def hidden_light_switch
        render action: 'switch'
    end

end