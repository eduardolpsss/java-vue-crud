<template>
    <v-form style="width: 500px;"  justify="center" align="center">
        <v-text-field disabled="true" v-if="id" v-model="id" label="Id"></v-text-field>
        <v-text-field v-model="nome" label="Nome do funcionário"></v-text-field>
        <v-text-field v-model="email" label="E-mail do funcionário"></v-text-field>
        <v-text-field type="number" v-model="idSetor" label="Id do setor do funcionário"></v-text-field>
        <v-text-field v-model="setor" label="Nome do setor do funcionário"></v-text-field>
        <v-text-field type="date" v-model="dataNasc" label="Data de nascimento"></v-text-field>
        <v-text-field type="number" v-model="salario" label="Salário"></v-text-field>
        <v-btn class="white--text" color="#003241" @click="submit({ id, idSetor, setor, nome, email, dataNasc, salario })">{{id ? 'Editar' : 'Enviar' }}</v-btn>
    </v-form>
</template>

<script>
export default {
    computed:{
        id: {
            get(){
                return this.$store.state.funcionario.id;
            },
            set(value){
                this.$store.commit("funcionario/storeId", value);
            },
        },
        nome: {
            get(){
                return this.$store.state.funcionario.nome;
            },
            set(value){
                this.$store.commit("funcionario/storeNome", value);
            },
        },
        email: {
            get(){
                return this.$store.state.funcionario.email;
            },
            set(value){
                this.$store.commit("funcionario/storeEmail", value);
            },
        },
        idSetor: {
            get(){
                return this.$store.state.funcionario.idSetor;
            },
            set(value){
                this.$store.commit("funcionario/storeIdSetor", value);
            },
        },
        setor: {
            get(){
                return this.$store.state.funcionario.setor;
            },
            set(value){
                this.$store.commit("funcionario/storeSetor", value);
            },
        },
        dataNasc: {
            get(){
                return this.$store.state.funcionario.dataNasc;
            },
            set(value){
                this.$store.commit("funcionario/storeDataNasc", value);
            },
        },
        salario: {
            get(){
                return this.$store.state.funcionario.salario;
            },
            set(value){
                this.$store.commit("funcionario/storeSalario", value);
            },
        },
    },
    methods: {
        async submit(funcionario) {
            if(funcionario.id){
                await this.$axios.put("http://localhost:8080/api/funcionarios/" + funcionario.id, funcionario);
            } else {
                await this.$axios.post("http://localhost:8080/api/funcionarios/", funcionario);
            }
            await this.restForm({ id: 0, idSetor:0, setor:"", nome:"", email:"", dataNasc:"", salario: 0 });

            this.$store.commit("funcionarios/storeData", (await this.$axios.get("http://localhost:8080/api/funcionarios/")).data);
        },
        restForm(funcionario) {
            this.$store.commit("funcionario/storeId", funcionario.id);
            this.$store.commit("funcionario/storeNome", funcionario.nome);
            this.$store.commit("funcionario/storeEmail", funcionario.email);
            this.$store.commit("funcionario/storeIdSetor", funcionario.idSetor);
            this.$store.commit("funcionario/storeSetor", funcionario.setor);
            this.$store.commit("funcionario/storeDataNasc", funcionario.dataNasc);
            this.$store.commit("funcionario/storeSalario", funcionario.salario);
        },
    },
};
</script>

<style>

</style>