<template>
  <v-data-table
    :headers='headers'
    :items='funcionarios'
    :items-per-page='10'
    class='elevation-5'
    style="text-align: center;"
  >

  <template v-slot:[`item.edit`]="{ item }">
    <v-btn class="white--text" color="#003241" @click="editItem(item)"> Edit </v-btn>
  </template>
  <template v-slot:[`item.delete`]="{ item }">
    <v-btn class="white--text" color="#DB1826" @click="deleteItem(item.id)"> Delete </v-btn>
  </template>

  </v-data-table>
</template>

<script>
export default {
  data () {
    return {
      headers: [
        { text: 'Nome do funcionário', value: 'nome'},
        { text: 'E-mail do funcionário', value: 'email' },
        { text: 'Id do setor do funcionário', value: 'idSetor' },
        { text: 'Nome do setor do funcionário', value: 'setor' },
        { text: 'Data de nascimento', value: 'dataNasc' },
        { text: 'Salário', value: 'salario' },
        { text: 'Editar', value: 'edit' },
        { text: 'Deletar', value: 'delete' }
      ],
    };
  },
  computed: {
    funcionarios(){
      return this.$store.state.funcionarios.data;
    },
  },
  async fetch(){
    this.$store.commit("funcionarios/storeData", (await this.$axios.get("http://localhost:8080/api/funcionarios/")).data);
  },
  methods: {
    async deleteItem(id) {
      await this.$axios.delete("http://localhost:8080/api/funcionarios/" + id)
         
      this.$store.commit("funcionarios/storeData", (await this.$axios.get("http://localhost:8080/api/funcionarios/")).data);
    },
    async editItem(funcionario) {
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