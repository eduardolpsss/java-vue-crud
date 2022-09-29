export const state = () => ({
    id: 0,
    nome: "",
    email: "",
    idSetor: 0,
    setor: "",
    dataNasc: "",
    salario: 0
})

export const mutations = {
    storeId: (state, data) => {
        state.id = data
    },
    storeNome: (state, data) => {
        state.nome = data
    },
    storeEmail: (state, data) => {
        state.email = data
    },
    storeIdSetor: (state, data) => {
        state.idSetor = data
    },
    storeSetor: (state, data) => {
        state.setor = data
    },
    storeDataNasc: (state, data) => {
        state.dataNasc = data
    },
    storeSalario: (state, data) => {
        state.salario = data
    }
}