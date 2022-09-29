<template>
    <div>
        <v-app>
            <v-main style="backgroundColor: #E3F0F1">
                <v-app-bar elevation="5">
                    <v-app-bar-title>
                        <img src="../src/hepta_logo.png" width="135px"/> 
                    </v-app-bar-title>
                </v-app-bar>

                <v-container justify="center" align="center">
                    <client-only>
                        <nuxt/>
                    </client-only>
                </v-container>
            </v-main>   
        </v-app>
    </div> 
</template>

<script>
    
export default {

}
</script>

<style>

</style>